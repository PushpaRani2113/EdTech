public class WheatManagement extends CropManagement {
    public WheatManagement(FarmingTechnique farmingTechnique) {
        super(farmingTechnique);
    }

    @Override
    public void manageCrop() {
        System.out.println("Managing Wheat crop.");
        farmingTechnique.applyTechnique("Wheat");
    }
}
