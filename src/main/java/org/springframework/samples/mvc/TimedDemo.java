//package org.springframework.samples.mvc;
//
//import io.micrometer.core.annotation.Timed;
//import io.micrometer.core.instrument.MeterRegistry;
//import io.micrometer.core.instrument.Timer;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//import java.util.stream.Stream;
//
//@WebServlet("/hello")
//public class TimedDemo extends HttpServlet {
//
//    private static final long serialVersionUID = -4751096228274971485L;
//
//    @Override
//    @Timed(value = "hello.world")
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        response.getWriter().println("Hello World!");
//        MeterRegistry registry = (MeterRegistry) getServletContext().getAttribute("AzureMonitorMeterRegistry");
//
//        //create new Timer metric
//        Timer sampleTimer = registry.timer("timer");
//        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i+1);
//        infiniteStream.limit(10).forEach(integer -> {
//            try {
//                Thread.sleep(1000);
//                sampleTimer.record(integer, TimeUnit.MILLISECONDS);
//            } catch (Exception e) {}
//        });
//    }
//    @Override
//    public void init() throws ServletException {
//        System.out.println("Servlet " + this.getServletName() + " has started");
//    }
//    @Override
//    public void destroy() {
//        System.out.println("Servlet " + this.getServletName() + " has stopped");
//    }
//
//}