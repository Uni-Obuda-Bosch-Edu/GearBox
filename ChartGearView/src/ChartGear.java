import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JFreeChart referenciák
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class ChartGear {

 @SuppressWarnings("deprecation")
public static void main(String[] args) throws Exception {
	
//Bemeneti grafikon paramétereinek megadása
  TimeSeries seriesInput = new TimeSeries("Fordulatszám", Millisecond.class);
  final TimeSeriesCollection data = new TimeSeriesCollection(seriesInput);
  JFreeChart chartInput = ChartFactory.createTimeSeriesChart( "Bementei Fordulatszám", 
          "Idõ", 
          "Fordulatszám",
          data, 
          false, 
          true, 
          false
      );
  chartInput.getXYPlot().getRenderer().setSeriesPaint(0, Color.blue);
  
  XYPlot plot = chartInput.getXYPlot();
  ValueAxis axis = plot.getDomainAxis();
  axis.setAutoRange(true);
  axis.setFixedAutoRange(30000.0);  // 60 seconds
  axis = plot.getRangeAxis();
  axis.setRange(0.0, 1000.0); 
  
//Kimeneti grafikon paramétereinek megadása  
  TimeSeries seriesOut = new TimeSeries("Fordulatszám", Millisecond.class);
  final TimeSeriesCollection dataOut = new TimeSeriesCollection(seriesOut);
  JFreeChart chartOut = ChartFactory.createTimeSeriesChart( "Kimeneti Fordulatszám", 
          "Idõ", 
          "Fordulatszám",
          dataOut, 
          false, 
          true, 
          false
      );
  chartOut.getXYPlot().getRenderer().setSeriesPaint(0, Color.blue);
  
  XYPlot plotOut = chartOut.getXYPlot();
  ValueAxis axisOut = plotOut.getDomainAxis();
  axisOut.setAutoRange(true);
  axisOut.setFixedAutoRange(30000.0);  
  axisOut = plot.getRangeAxis();
  axisOut.setRange(0.0, 1000.0); 
  

//Megjelenítõ felület össze állítása, elrendezés
  JFrame window = new JFrame("Charts");
  window.setVisible(true);
  window.setSize(750, 700);
  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JPanel panel = new JPanel();
  panel.setLayout(null);
  window.add(panel);
  
  JButton button = new JButton("Start");
  button.setBounds(250,300,120,35);
  button.setActionCommand("ADD_DATA");
  panel.add(button);
  
  ChartPanel chartPanel = new ChartPanel(chartInput);
  chartPanel.setBounds(20,0,700,300);
  panel.add(chartPanel);
  
  ChartPanel chartPanelOut = new ChartPanel(chartOut);
  chartPanelOut.setBounds(20,335,700,300);
  panel.add(chartPanelOut);
  
  
 //Test célzattal random értékekkel való feltõltés   
  for (int i = 0; i < 5000;) {
   Thread.sleep(250);  //0.25 sec késleltetés
   
   double random = Math.random() * 1000;
   seriesInput.add(new Millisecond(), random);
   
   
   seriesOut.add(new Millisecond(), random +100);
  }
 }

}