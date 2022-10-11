import java.util.HashMap;

public class IngredientFlyweightFactory {

  private IngredientFlyweightFactory() {
  }

  private final HashMap<String, IngredientFlyweight> hashMap = new HashMap<>();

  public IngredientFlyweight getIngredient(String name) {
    if (!hashMap.containsKey(name)) {
      hashMap.put(name, new IngredientConcreteFlyweight(name));
    }
    return hashMap.get(name);
  }

  private static IngredientFlyweightFactory instance = null;

  public static IngredientFlyweightFactory getInstance() {
    if (instance == null) {
      instance = new IngredientFlyweightFactory();
    }
    return instance;
  }

}
