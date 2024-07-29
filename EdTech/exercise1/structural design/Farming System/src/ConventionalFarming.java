public class ConventionalFarming implements FarmingTechnique {
    @Override
    public void applyTechnique(String crop) {
        System.out.println("Applying conventional farming techniques to " + crop + ".");
    }
}
