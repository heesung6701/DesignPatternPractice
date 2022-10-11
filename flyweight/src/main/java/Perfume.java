import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Perfume {

  String name;

  public Perfume(String name) {
    this.name = name;
  }

  ArrayList<IngredientFlyweight> topNotes = new ArrayList<>();
  ArrayList<IngredientFlyweight> middleNotes = new ArrayList<>();
  ArrayList<IngredientFlyweight> baseNotes = new ArrayList<>();

  void addIngredient(NoteType type, IngredientFlyweight ingredientFlyweight) {
    ArrayList<IngredientFlyweight> notes = switch (type) {
      case TOP -> topNotes;
      case MIDDLE -> middleNotes;
      case BASE -> baseNotes;
    };
    notes.add(ingredientFlyweight);
  }

  public String getDescription() {
    return Stream.of(topNotes.stream().map(it -> it.getDescription(this, NoteType.TOP))
                .collect(Collectors.toList()),
            middleNotes.stream().map(it -> it.getDescription(this, NoteType.MIDDLE))
                .collect(Collectors.toList()),
            baseNotes.stream().map(it -> it.getDescription(this, NoteType.BASE))
                .collect(Collectors.toList())).flatMap(Collection::stream)
        .collect(Collectors.joining("\n"));
  }
}
