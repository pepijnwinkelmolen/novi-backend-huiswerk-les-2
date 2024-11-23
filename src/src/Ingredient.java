public class Ingredient {
    private float unitValue;
    private String unitName;
    private String ingredientName;

    public Ingredient(float unitValue, String unitName, String ingredientName) {
        this.unitValue = unitValue;
        this.unitName = unitName;
        this.ingredientName = ingredientName;
    }

    public Ingredient(int unitValue, String ingredientName) {
        this.unitValue = unitValue;
        this.ingredientName = ingredientName;
    }

    public float getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(float unitValue) {
        this.unitValue = unitValue;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
