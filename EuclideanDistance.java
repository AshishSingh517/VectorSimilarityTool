package VectorSimilarityTool;

public class EuclideanDistance implements SimilarityCalculator {
    @Override
    public double CalculateSimilarity(double[] vector1, double[] vector2) {
        double distance = 0.0;

        for (int i = 0; i < vector1.length; i++) {
            distance += Math.pow(vector1[i] - vector2[i], 2);

        }
        double Euclidean_distance = Math.sqrt(distance);
        return distance;
    }
}

