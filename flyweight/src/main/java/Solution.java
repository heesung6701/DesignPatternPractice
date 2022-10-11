import java.util.Arrays;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    for (int i = 0; i < 100000; i++) {
      Perfume p = new Perfume("향수 " + i);
      for (int j = 0; j < 3; j++) {
        p.addIngredient(NoteType.TOP, getRandomIngredient());
        p.addIngredient(NoteType.MIDDLE, getRandomIngredient());
        p.addIngredient(NoteType.BASE, getRandomIngredient());
      }
      System.out.println(p.getDescription());
    }
  }

  private static final IngredientFlyweightFactory factory = IngredientFlyweightFactory.getInstance();
  private static final List<String> ingredientNames = Arrays.asList("베르가못", "그레이프프루츠", "오렌지", "라벤더", "민트", "파프리카");

  public static IngredientFlyweight getRandomIngredient() {
      int idx = (int) (Math.random() * ingredientNames.size());
      return factory.getIngredient(ingredientNames.get(idx));
  }
}
