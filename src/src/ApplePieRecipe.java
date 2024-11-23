public class ApplePieRecipe {
    /*
    200 gram ongezouten roomboter
    200 gram witte bastard suiker
    400 gram zelfrijzend bakmeel
    1 stuk(s) ei
    8 gram vanillesuiker
    1 snuf zout
    1.5 kilo zoetzure appels
    75 gram kristal suiker
    3 theelepels kaneel
    15 gram paneermeel
     */

    Ingredient ongezoutenRoomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient witteBastardSuiker = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient zelfrijzendBakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient eieren = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient zoetzureAppels = new Ingredient(1.5F, "kilo", "zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    public ApplePieRecipe() { }

    public void printApplePieRecipe() {
        String newLine = System.lineSeparator();

        System.out.println("Ingrediénten:" + newLine + newLine + ongezoutenRoomboter.getUnitValue() + ongezoutenRoomboter.getUnitName() + ongezoutenRoomboter.getIngredientName() + newLine + witteBastardSuiker.getUnitValue() + witteBastardSuiker.getUnitName() + witteBastardSuiker.getIngredientName() + newLine + zelfrijzendBakmeel.getUnitValue() + zelfrijzendBakmeel.getUnitName() + zelfrijzendBakmeel.getIngredientName() + newLine + eieren.getUnitValue() + eieren.getUnitName() + eieren.getIngredientName() + newLine + vanillesuiker.getUnitValue() + vanillesuiker.getUnitName() + vanillesuiker.getIngredientName() + newLine + zout.getUnitValue() + zout.getUnitName() + zout.getIngredientName() + newLine + zoetzureAppels.getUnitValue() + zoetzureAppels.getUnitName() + zoetzureAppels.getIngredientName() + newLine + kristalSuiker.getUnitValue() + kristalSuiker.getUnitName() + kristalSuiker.getIngredientName() + newLine + kaneel.getUnitValue() + kaneel.getUnitName() + kaneel.getIngredientName() + newLine + paneermeel.getUnitValue() + paneermeel.getUnitName() + paneermeel.getIngredientName() + newLine + newLine + "Stappen:" + newLine + newLine + "Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)" + newLine + "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart." + newLine + "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen." + newLine + "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel." + newLine + "Vet de springvorm in en bestrooi deze met bloem." + newLine + "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op." + newLine + "Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm." + newLine + "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed." + newLine + "Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken." + newLine + "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}
