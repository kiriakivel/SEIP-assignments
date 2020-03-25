package gr.aueb.dmst.kvelliniati;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.*;
import java.util.*;

/***
 *
 * @author kiriakivel 
 * The purpose of this class is to create a JFreeChart XYLine chart showing a histogram of grades.
 */
public class HistogramGenerator {

	/***
	 * Receives a single dimension Integer array.
	 * From this array the dataset that will be used for the visualization is generated. 
	 * Finally, the chart is generated with the use of the aforementioned dataset 
	 * and then printed on the screen.
	 *
	 * @param dataValues Single dimension integer array
	 */
	public void generateChart(int[] dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that
		 * can be visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many
		 * series in one dataset.
		 */
		XYSeries data = new XYSeries("random values");

		/*
		 * Populating the XYSeries data object from the input Integer array
		 * values.
		 */
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Chart title", "x_axis title", "y_axis_title", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the
		 * previously created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}

	/***
	 * Receives a String with the path to the input file containing the grades.
	 * An array of integers is created, counting the number of students
	 * who got each grade from 0 to 10. Then it is passed as an arguement
	 * to the generateChart method to create and display the histogram.
	 *
	 * @param args The path to the input file.
	 */
	public static void main(String[] args) throws Exception {

		/*
		 * A text file with integer values of grades
		 * is passed as command line arguement.
		 */
		String inputPath = args[0];

		/*
		 * An array with a cell for each grade from 0 to 10
		 * is created and initialized with zero.
		 */
        int[] inputValues = new int[11] ;
        for (int i : inputValues) {
			i = 0;
		}

		/*
		 * A File and a Scanner object are created to read
		 * each line of the text file without line separators.
		 */
        File grades = new File(inputPath);
        Scanner scan = new Scanner(grades);

		/*
		 * The numbers contained in each String are turned to integers.
		 * Then it is assigned to the cell it belongs to.
		 */
        while (scan.hasNextLine()) {

        	int newGrade = Integer.parseInt(scan.nextLine());
			inputValues[newGrade]++;

        }

		/*
		 * An instance of the class is created to call the method
		 * which generates the histogram of the grades.
		 */
		HistogramGenerator hg = new HistogramGenerator();
		hg.generateChart(inputValues);
	}
}