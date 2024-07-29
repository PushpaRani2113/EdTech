public class CornManagement extends CropManagement {
    public CornManagement(FarmingTechnique farmingTechnique) {
        super(farmingTechnique);
    }

    @Override
    public void manageCrop() {
        System.out.println("Managing Corn crop.");
        farmingTechnique.applyTechnique("Corn");
    }
}
