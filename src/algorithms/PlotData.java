package algorithms;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.ScatterPlot;

public class PlotData extends AbstractExample {

	public static void main(String[] args) throws IOException {
		Table table = Table.read().csv("/Users/m-store/eclipse-workspace/MachineLearning/customersData.csv");
		out(table);
		// unique(): returns a column of only the unique values.
		out(table.structure().printAll());
		out(table.column("Channel").unique().print());
		out(table.column("Region").unique().print());
		out(table.column("Fresh").unique().print());
		Table champagne = table.where(
				table.doubleColumn("Milk").isEqualTo(8808.0).and(table.doubleColumn("Grocery").isEqualTo(7684.0)));
		Plot.show(ScatterPlot.create("Milk prices by Grocery", champagne, "Milk", "Grocery"));

	}

}
