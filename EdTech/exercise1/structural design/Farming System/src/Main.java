public class Main {
    public static void main(String[] args) {
        FarmingTechnique organicFarming = new OrganicFarming();
        FarmingTechnique conventionalFarming = new ConventionalFarming();
        CropManagement wheatWithOrganic = new WheatManagement(organicFarming);
        CropManagement cornWithConventional = new CornManagement(conventionalFarming);
        wheatWithOrganic.manageCrop();
        cornWithConventional.manageCrop();
    }
}
