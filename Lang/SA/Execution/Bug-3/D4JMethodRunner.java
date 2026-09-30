import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

public class D4JMethodRunner {
    public static void main(String[] args) throws Exception {
        Class<?> testClass = Class.forName(args[0]);
        Request request = Request.method(testClass, args[1]);
        Result result = new JUnitCore().run(request);

        System.out.println("RUN_COUNT=" + result.getRunCount());
        System.out.println("FAILURE_COUNT=" + result.getFailureCount());
        System.out.println("IGNORE_COUNT=" + result.getIgnoreCount());
        System.out.println("RUN_TIME=" + result.getRunTime());

        if (!result.wasSuccessful()) {
            result.getFailures().forEach(failure -> {
                System.out.println("FAILURE:");
                System.out.println(failure.toString());
                System.out.println(failure.getTrace());
            });
        }

        System.out.println(result.wasSuccessful()
                ? "RESULT=PASS"
                : "RESULT=FAIL");

        System.exit(result.wasSuccessful() ? 0 : 1);
    }
}
