package VectorSimilarityTool;

public class JaccardDistance implements SimilarityCalculator {
    @Override
    public double CalculateSimilarity(double[] vector1, double[] vector2) {
        int intersectionSize = 0;
        int unionSize = vector1.length + vector2.length;

        // Check for common elements
        for (double num1 : vector1) {
            for (double num2 : vector2) {
                if (num1 == num2) {
                    intersectionSize++;
                    unionSize--; // Remove one count from the union for each common element
                    break; // Exit the inner loop as soon as a common element is found
                }
            }
        }

        double jaccardCoefficient = ((double) intersectionSize / unionSize) * 100;

        return jaccardCoefficient;
    }
}


