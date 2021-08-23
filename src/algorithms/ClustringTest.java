package algorithms;

import static tech.tablesaw.aggregate.AggregateFunctions.max;
import static tech.tablesaw.aggregate.AggregateFunctions.mean;
import static tech.tablesaw.aggregate.AggregateFunctions.median;
import static tech.tablesaw.aggregate.AggregateFunctions.min;

import smile.clustering.KMeans;
import smile.plot.ScatterPlot;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.selection.Selection;

public class ClustringTest {
	public ClustringTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		/**
		 * Loading the data
		 */
		Table data = Table.read().csv("/Users/m-store/eclipse-workspace/MachineLearning/customersData.csv");

		/**
		 * Cleaning the data set and removing the rows which contains null
		 */
		Table dat_Clean = data.dropRowsWithMissingValues();

		/**
		 * Exploring the data set
		 */
		System.out.println("Printing the last rows of the table");
		Table tablehead = dat_Clean.first(5);
		System.out.println(tablehead);

		// Table Shape
		String tableShape = dat_Clean.shape();
		System.out.println(tableShape); // 440 rows X 8 col

		/**
		 * Removing the first 2 columns of the data set
		 */
		// Table customerSegmentation_Categorical =
		// (Table)customerSegmentation_Clean.column("Channel", "Region");
		Table customerSegmentation_CleanFinal = (Table) dat_Clean.removeColumns("Channel", "Region");

		Table tablehead1 = customerSegmentation_CleanFinal.first(5);
		System.out.println(tablehead1);
		/**
		 * Brief understanding of the dataset
		 */
		Table custDataDist1 = customerSegmentation_CleanFinal.summarize("Milk", "Frozen", "Grocery", "Fresh", mean)
				.apply();
		System.out.println(custDataDist1);
		Table custDataDist4 = customerSegmentation_CleanFinal
				.summarize("Detergents_Paper", "Delicatessen", mean, median, max, min).apply();
		System.out.println(custDataDist4);
		Table custDataDist2 = customerSegmentation_CleanFinal.summarize("Milk", "Frozen", "Grocery", "Fresh", median)
				.apply();
		System.out.println(custDataDist2);
		Table custDataDist3 = customerSegmentation_CleanFinal.summarize("Milk", "Frozen", "Grocery", "Fresh", max, min)
				.apply();
		System.out.println(custDataDist3);

		/**
		 * Separating the dataset into training and testing
		 */

		// from 1, 350 Train data
		// 351, 440 Test Data.
		Table customerSegmentationTrain = customerSegmentation_CleanFinal.where(Selection.withRange(1, 350));
		Table customerSegmentationTest = customerSegmentation_CleanFinal.where(Selection.withRange(351, 440));

		// Converting tables to double arrays
		double[][] customerSegmentationTrain_Arr = customerSegmentationTrain.as().doubleMatrix();
		double[][] customerSegmentationTest_Arr = customerSegmentationTest.as().doubleMatrix();

		/**
		 * Plotting the dataset
		 */
		// (double[][] points, char mark, Color color);
		
//		Table theScatterData = Table.create("theScatterData", age, bmi);
//		Figure scatterFigure = ScatterPlot.create("Age by BMI ", theScatterData, "Age", "Bmi");
//		Plot.show(scatterFigure);

		ScatterPlot myScatter = new ScatterPlot(customerSegmentationTest_Arr);
		System.out.println("myScatter" + myScatter);

		/**
		 * Fitting the KMeans Model
		 * 
		 * @param data    the input data of multy row sample.
		 * @param k       the number of clusters.
		 * @param maxIter the maximum number of iterations for each running.
		 * @param runs    the number of runs of K-Means algorithm.
		 */
		KMeans kmeans = new KMeans(customerSegmentationTrain_Arr, 3, 100, 20);
		System.out.println(kmeans);

		/**
		 * Testing our K means Model
		 */

		double[] theX = { 10290, 1981, 2232, 1038, 168, 2125 };
		System.out.println("we are predicting " + kmeans.predict(theX));
		System.out.println("we printing " + kmeans.getClusterLabel()[8]);
		System.out.println("we printing " + kmeans.getClusterSize()[1]);
		System.out.println("we printing " + kmeans.centroids()[0][1]);

	}
}