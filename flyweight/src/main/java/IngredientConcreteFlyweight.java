
public class IngredientConcreteFlyweight implements IngredientFlyweight {

  String name;

  public IngredientConcreteFlyweight(String name) {
    this.name = name;
  }

  @Override
  public String getDescription(Perfume perfume, NoteType noteType) {
    return perfume.name + "는 " + name +"를 " + noteType.name() + "노트에 가지고 있습니다.";
  }
}
