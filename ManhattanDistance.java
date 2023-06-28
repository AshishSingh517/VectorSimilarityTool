package VectorSimilarityTool;

public class ManhattanDistance implements SimilarityCalculator {
    @Override
    public double CalculateSimilarity(double[] vector1, double[] vector2) {
        double distance = 0.0;
        for (int i = 0; i < vector1.length; i++) {
            distance += Math.abs(vector1[i] - vector2[i]);
        }

        return distance;
    }
}
