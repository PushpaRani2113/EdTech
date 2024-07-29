public abstract class CropManagement {
    protected FarmingTechnique farmingTechnique;

    public CropManagement(FarmingTechnique farmingTechnique) {
        this.farmingTechnique = farmingTechnique;
    }

    public abstract void manageCrop();
}
