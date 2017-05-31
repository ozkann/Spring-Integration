package beans;

import javax.annotation.PostConstruct;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.springframework.stereotype.Component;

@Component("chartBean")
public class Chart  {



	
	private LineChartModel animatedModel1;
    private BarChartModel animatedModel2;
 
    @PostConstruct
    public void init() {
        createAnimatedModels();
    }
 
 
    public BarChartModel getAnimatedModel2() {
        return animatedModel2;
    }
 
    private void createAnimatedModels() {
    	
        animatedModel1 = initLinearModel();
        animatedModel1.setTitle("Line Chart");
        animatedModel1.setAnimate(true);
        animatedModel1.setLegendPosition("se");
        Axis yAxis = animatedModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
         
        animatedModel2 = initBarModel();
        animatedModel2.setTitle("Sample of Sales Analysis (Monthly)");
        animatedModel2.setAnimate(true);
        animatedModel2.setLegendPosition("ne");
        yAxis = animatedModel2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
     
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries product_1 = new ChartSeries();
        product_1.setLabel("Product_1");
        product_1.set("January", 120);
        product_1.set("February", 100);
        product_1.set("March", 44);
        product_1.set("April", 150);
        product_1.set("May", 25);
 
        ChartSeries product_2 = new ChartSeries();
        product_2.setLabel("Product_2");
        product_2.set("January", 52);
        product_2.set("February", 60);
        product_2.set("March", 110);
        product_2.set("April", 135);
        product_2.set("May", 120);
 
        model.addSeries(product_1);
        model.addSeries(product_2);
         
        return model;
    }
     
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");
 
        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");
 
        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);
 
        model.addSeries(series1);
        model.addSeries(series2);
         
        return model;
    }
    
	
}
