package algorithms;

import org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class MatrixScalingOperator implements RealMatrixChangingVisitor {

	MultivariateSummaryStatistics mss;

	public MatrixScalingOperator(MultivariateSummaryStatistics mss) {
		this.mss = mss;

	}

	@Override
	public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
		// TODO Auto-generated method stub

	}

	@Override
	public double visit(int row, int column, double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double end() {
		// TODO Auto-generated method stub
		return 0;
	}

}
