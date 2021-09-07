package algorithms;


import tech.tablesaw.api.Table;

import java.io.IOException;

public class CrossValidation {

public CrossValidation(){}

    public static void main(String[] args) throws IOException {

        //Loading the IRIS dataset in to a Table
    Table isrDataset= Table.read().csv("/Users/m-store/eclipse-workspace/MachineLearning/IrisDataset.csv");
    // print the structure of the datesets:
    // System.out.println(isrDataset.structure())

        Table firstRows= isrDataset.first(5);
        System.out.println(firstRows);
        Table TableTail = isrDataset.last(5);
        System.out.println(TableTail);


    }
}
