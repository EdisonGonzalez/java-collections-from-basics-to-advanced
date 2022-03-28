package unit8StreamsInDepthAndCollections.C2;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDemo {

    public static void main(String[] args) {
        long time1, time2;
        List<Employee> eList = new ArrayList<Employee>();
        for(int i = 0 ; i<100;i++) {
            eList.add(new Employee("john",20000));
            eList.add(new Employee("Rohn",3000));
            eList.add(new Employee("Tom",15000));
            eList.add(new Employee("Bheem",8000));
            eList.add(new Employee("Shiva",200));
            eList.add(new Employee("Krishna",50000));
        }

        // Sequential processing
        time1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count = " + eList.stream().filter(e -> e.getSalary() > 1000).count());
        time2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken = " + (time2 - time1) + "ms" + "\n");

        /**
         * REMEMBER:
         *
         * In this example its possible processing in parallel way because the problem complies with being:
         *
         *    1. STATELESS : State of one element does nopt affect another element.
         *    2. NON-INTERFERING: Data source is not affected while operation.
         *    3. ASSOCIATIVE: One operation result is not affected by the order of data under processing.
         */
        // Parallel processing - way 1 - parallelStream()
        time1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count with parallelStream() = " + eList.parallelStream().filter(e -> e.getSalary() > 1000).count());
        time2 = System.currentTimeMillis();
        System.out.println("Time taken by Parallel processing (parallelStream()): " + (time2-time1) + "ms" + "\n");

        // Parallel processing - way 2 - stream().parallel()
        time1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count with stream().parallel() = " + eList.stream().parallel().filter(e -> e.getSalary() > 1000).count());
        time2 = System.currentTimeMillis();
        System.out.println("Time taken by Parallel processing (stream().parallel()): " + (time2-time1) + "ms" + "\n");

        /**
         * NOTE: Check if you change the order between parallelStream() and stream().parallel()
         * the last one will always mark the best time record
         */
    }
}
