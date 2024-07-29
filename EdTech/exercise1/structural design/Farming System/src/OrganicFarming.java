public class OrganicFarming implements FarmingTechnique {
    @Override
    public void applyTechnique(String crop) {
        System.out.println("Applying organic farming techniques to " + crop + ".");
    }
}
