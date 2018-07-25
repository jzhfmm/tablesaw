package tech.tablesaw.plotly;

import tech.tablesaw.AbstractExample;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.api.BoxPlot;
import tech.tablesaw.plotly.api.Histogram;
import tech.tablesaw.plotly.api.Histogram2D;

public class DistributionVisualizations extends AbstractExample {

    public static void main(String[] args) throws Exception {

        Table property = Table.read().csv("../data/sacramento_real_estate_transactions.csv");
        out(property.structure());

        Histogram.show("Distribution of prices", property.numberColumn("price"));

        Histogram.show("Distribution of property sizes", property.numberColumn("sq__ft"));

        Histogram2D.show("Distribution of price and size", property,"price", "sq__ft");

        BoxPlot.show("Prices by property type", property, "type", "price");
    }
}
