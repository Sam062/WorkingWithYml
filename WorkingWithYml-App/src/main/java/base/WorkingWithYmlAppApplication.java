package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WorkingWithYmlAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication
                .run(WorkingWithYmlAppApplication.class, args);
        YmlConfig ymlBean = context.getBean(YmlConfig.class);

        System.out.println("application.yml reader :: " + ymlBean);


        /*Expected Output
         *
         *application.yml reader ::
         * YmlConfig(name=application.yml,
         * dataDistribution={data-fetch={desc=Hello data-fetch, name=NAME1, Age=18, salary=12.3},
         * data-download={desc=Hello data-download, name=NAME1, Age=18, salary=12.3}},
         * generateReport={trigger={desc=Hello generate-report, name=NAME1, Age=18, salary=12.3},
         * auto-trigger={desc=Hello auto-trigger, name=NAME1, Age=18, salary=12.3}})
         *
         * */

        MyPropsConfig myPropsConfig = context.getBean(MyPropsConfig.class);
        System.out.println("myProps.yml reader :: " + myPropsConfig);

        /*Expected Output
         *
         *myProps.yml reader ::
         * MyPropsConfig(name=application.yml,
         * dataDistribution={data-fetch={desc=Hello data-fetch, name=NAME1, Age=18, salary=12.3},
         * data-download={desc=Hello data-download, name=NAME1, Age=18, salary=12.3}},
         * generateReport={trigger={desc=Hello generate-report, name=NAME1, Age=18, salary=12.3},
         * auto-trigger={desc=Hello auto-trigger, name=NAME1, Age=18, salary=12.3}})
         *
         * */
    }

}
