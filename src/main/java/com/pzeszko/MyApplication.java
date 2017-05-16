package com.pzeszko;

import com.pzeszko.decorator.DocumentGenerator;
import com.pzeszko.decorator.DocumentGeneratorImpl;
import com.pzeszko.decorator.SignedDocumentGeneratorImpl;
import com.pzeszko.decorator.TestGenerator;
import com.pzeszko.factory.CleanService;
import com.pzeszko.factory.CleanServiceFactory;
import com.pzeszko.service.AccountServiceImpl;
import com.pzeszko.service.SchoolServiceImpl;
import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by Admin on 01.05.2017.
 */
//@SpringBootApplication
//@EnableJms
public class MyApplication {


    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(MyApplication.class, args);
//        //testJPAMAppings(context);
//
//        boolean val = true;
//        FancyService f = (firstname, lastname) -> {
//            if(val) {return "";
//            return firstname + " " + lastname.toUpperCase();
//        };
//
//           System.out.println(f.formatFullname("Pawel", "Zeszko"));
       //testDecorator();
        testFactory();
    }
    public static void testFactory() {
        CleanService cleanService = CleanServiceFactory.getCleanService("Pawka");
        CleanService cleanService1 = CleanServiceFactory.getCleanService("Anka");

        cleanService.clean();
        cleanService1.clean();
    }
    public static void testDecorator() {
        DocumentGenerator generator = new DocumentGeneratorImpl();
        DocumentGenerator signedGenerator = new SignedDocumentGeneratorImpl(new DocumentGeneratorImpl());
        TestGenerator testGenerator = new TestGenerator();
        System.out.println(generator.generate("DOC001"));
        System.out.println(signedGenerator.generate("DOC001_SIGNED"));
        System.out.println(testGenerator.generate1("DOC001_SIGNED2"));
    }
    public static void fixMe(int[] a) {
        a[0] = 4;
    }

    public static void testJPAMAppings(ConfigurableApplicationContext context) {
        SchoolServiceImpl service = context.getBean(SchoolServiceImpl.class);

        service.testMapping();
    }

    public static void testLocking(ConfigurableApplicationContext context) {

        AccountServiceImpl service = context.getBean(AccountServiceImpl.class);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                service.doubleAmount();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                service.doubleAmount();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                service.doubleAmount();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                service.doubleAmount();
            }
        });

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                service.doubleAmount();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        service.doubleAmount();
    }

    //    @Bean // Serialize message content to json using TextMessage

    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }

    public static void testJms(ConfigurableApplicationContext context) {

//        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
//        jmsTemplate.convertAndSend("jmsReceiver", new Message("Hello Pawel", "My Dear Pawel, great to finally meet you!"));
//        txTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }
//    public MessageConverter jacksonJmsMessageConverter() {
//        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//        converter.setTargetType(MessageType.TEXT);
//        converter.setTypeIdPropertyName("_type");
//        return converter;
//    }
//
//    @Bean
//    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
//                                                    DefaultJmsListenerContainerFactoryConfigurer configurer) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        // This provides all boot's default to this factory, including the message converter
//        configurer.configure(factory, connectionFactory);
//        // You could still override some of Boot's default if necessary.
//        return factory;
//    }
}
