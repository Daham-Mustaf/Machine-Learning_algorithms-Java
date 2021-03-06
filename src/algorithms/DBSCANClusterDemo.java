package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.ml.clustering.Cluster;
import org.apache.commons.math3.ml.clustering.Clusterer;
import org.apache.commons.math3.ml.clustering.DBSCANClusterer;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;

public class DBSCANClusterDemo {
	DBSCANClusterDemo() {
	 }

	public void clusterTest() throws Exception {
		/*
		 * creat an object of KMeansPlusPlusClusterer:
		 * KMeansPlusPlusClusterer takes k the number of clusters to split the data into
		 */
		
		Clusterer<DoublePoint> clusterer = new KMeansPlusPlusClusterer<DoublePoint>(2);
		List<DoublePoint> list = new ArrayList<>();
		// add data points to the list.
		list.add(new DoublePoint(new double[] { 11 }));
		list.add(new DoublePoint(new double[] { 12.6 }));
		list.add(new DoublePoint(new double[] { 1.82 }));
		list.add(new DoublePoint(new double[] { 33.5 }));
		list.add(new DoublePoint(new double[] { 33.6 }));
		list.add(new DoublePoint(new double[] { 44 }));
		list.add(new DoublePoint(new double[] { 44.2 }));
		list.add(new DoublePoint(new double[] { 44.2 }));
		list.add(new DoublePoint(new double[] { 12.2 }));
		
		System.out.println(list);

		List<? extends Cluster<DoublePoint>> res = clusterer.cluster(list);
		System.out.println(res.size());
		for (Cluster<DoublePoint> re : res) {
			// print the points of each cluster
			System.out.println(re.getPoints());
		}
	}

	public static void main(String[] args) throws Exception {
		DBSCANClusterDemo dmClusterDemo = new DBSCANClusterDemo();
		dmClusterDemo.clusterTest();

		DoublePoint[] point = new DoublePoint[] {
				new DoublePoint(new double[] { 83.08303244924173, 58.83387754182331 }),
				new DoublePoint(new double[] { 45.05445510940626, 23.469642649637535 }),
				new DoublePoint(new double[] { 14.96417921432294, 69.0264096390456 }),
				new DoublePoint(new double[] { 73.53189604333602, 34.896145021310076 }),
				new DoublePoint(new double[] { 73.28498173551634, 33.96860806993209 }),
				new DoublePoint(new double[] { 73.45828098873608, 33.92584423092194 }),
				new DoublePoint(new double[] { 73.9657889183145, 35.73191006924026 }),
				new DoublePoint(new double[] { 74.0074097183533, 36.81735596177168 }),
				new DoublePoint(new double[] { 73.41247541410848, 34.27314856695011 }),
				new DoublePoint(new double[] { 73.9156256353017, 36.83206791547127 }),
				new DoublePoint(new double[] { 74.81499205809087, 37.15682749846019 }),
				new DoublePoint(new double[] { 74.03144880081527, 37.57399178552441 }),
				new DoublePoint(new double[] { 74.51870941207744, 38.674258946906775 }),
				new DoublePoint(new double[] { 74.50754595105536, 35.58903978415765 }),
				new DoublePoint(new double[] { 74.51322752749547, 36.030572259100154 }),
				new DoublePoint(new double[] { 59.27900996617973, 46.41091720294207 }),
				new DoublePoint(new double[] { 59.73744793841615, 46.20015558367595 }),
				new DoublePoint(new double[] { 58.81134076672606, 45.71150126331486 }),
				new DoublePoint(new double[] { 58.52225539437495, 47.416083617601544 }),
				new DoublePoint(new double[] { 58.218626647023484, 47.36228902172297 }),
				new DoublePoint(new double[] { 60.27139669447206, 46.606106348801404 }),
				new DoublePoint(new double[] { 60.894962462363765, 46.976924697402865 }),
				new DoublePoint(new double[] { 62.29048673878424, 47.66970563563518 }),
				new DoublePoint(new double[] { 61.03857608977705, 46.212924720020965 }),
				new DoublePoint(new double[] { 60.16916214139201, 45.18193661351688 }),
				new DoublePoint(new double[] { 59.90036905976012, 47.555364347063005 }),
				new DoublePoint(new double[] { 62.33003634144552, 47.83941489877179 }),
				new DoublePoint(new double[] { 57.86035536718555, 47.31117930193432 }),
				new DoublePoint(new double[] { 58.13715479685925, 48.985960494028404 }),
				new DoublePoint(new double[] { 56.131923963548616, 46.8508904252667 }),
				new DoublePoint(new double[] { 55.976329887053, 47.46384037658572 }),
				new DoublePoint(new double[] { 56.23245975235477, 47.940035191131756 }),
				new DoublePoint(new double[] { 58.51687048212625, 46.622885352699086 }),
				new DoublePoint(new double[] { 57.85411081905477, 45.95394361577928 }),
				new DoublePoint(new double[] { 56.445776311447844, 45.162093662656844 }),
				new DoublePoint(new double[] { 57.36691949656233, 47.50097194337286 }),
				new DoublePoint(new double[] { 58.243626387557015, 46.114052729681134 }),
				new DoublePoint(new double[] { 56.27224595635198, 44.799080066150054 }),
				new DoublePoint(new double[] { 57.606924816500396, 46.94291057763621 }),
				new DoublePoint(new double[] { 30.18714230041951, 13.877149710431695 }),
				new DoublePoint(new double[] { 30.449448810657486, 13.490778346545994 }),
				new DoublePoint(new double[] { 30.295018390286714, 13.264889000216499 }),
				new DoublePoint(new double[] { 30.160201832884923, 11.89278262341395 }),
				new DoublePoint(new double[] { 31.341509791789576, 15.282655921997502 }),
				new DoublePoint(new double[] { 31.68601630325429, 14.756873246748 }),
				new DoublePoint(new double[] { 29.325963742565364, 12.097849250072613 }),
				new DoublePoint(new double[] { 29.54820742388256, 13.613295356975868 }),
				new DoublePoint(new double[] { 28.79359608888626, 10.36352064087987 }),
				new DoublePoint(new double[] { 31.01284597092308, 12.788479208014905 }),
				new DoublePoint(new double[] { 27.58509216737002, 11.47570110601373 }),
				new DoublePoint(new double[] { 28.593799561727792, 10.780998203903437 }),
				new DoublePoint(new double[] { 31.356105766724795, 15.080316198524088 }),
				new DoublePoint(new double[] { 31.25948503636755, 13.674329151166603 }),
				new DoublePoint(new double[] { 32.31590076372959, 14.95261758659035 }),
				new DoublePoint(new double[] { 30.460413702763617, 15.88402809202671 }),
				new DoublePoint(new double[] { 32.56178203062154, 14.586076852632686 }),
				new DoublePoint(new double[] { 32.76138648530468, 16.239837325178087 }),
				new DoublePoint(new double[] { 30.1829453331884, 14.709592407103628 }),
				new DoublePoint(new double[] { 29.55088173528202, 15.0651247180067 }),
				new DoublePoint(new double[] { 29.004155302187428, 14.089665298582986 }),
				new DoublePoint(new double[] { 29.339624439831823, 13.29096065578051 }),
				new DoublePoint(new double[] { 30.997460327576846, 14.551914158277214 }),
				new DoublePoint(new double[] { 30.66784126125276, 16.269703107886016 }) };

		double eps = 5.0;
		int minPts = 3;

		DBSCANClusterer<DoublePoint> clusterer = new DBSCANClusterer<DoublePoint>(eps, minPts);
		List<Cluster<DoublePoint>> results = clusterer.cluster(Arrays.asList(point));
		if (results.isEmpty()) {
			System.out.println("No clusters were found");
		} else {
			for (Cluster<DoublePoint> result : results) {
				/* each clusters points are in here */
				List<DoublePoint> points = result.getPoints();
				System.out.println(points.size());
				// TODO do something with the points in each cluster
			//	System.out.println(points);

			}
		}

	}

}