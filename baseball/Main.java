public class Main extends Object {

    public static void main(String[] args) {
            BaseballOutcome outcome = BaseballOutcomeFactory.createRandomOutcome();
            System.out.println(outcome.getOutcome());
    }
}
