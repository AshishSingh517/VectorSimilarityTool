package VectorSimilarityTool;

class CosineSimilarity implements SimilarityCalculator {
    @Override
    public double CalculateSimilarity(double[] vector1, double[] vector2) {
        double magnitude1 = 0.0;
        double magnitude2 = 0.0;
        double dotproduct = 0.0;
        double CosineSimilarity = 0.0;
        for (int i = 0; i < vector1.length; i++) {
            dotproduct += vector1[i] * vector2[i];
            magnitude1 += Math.pow(vector1[i], 2);
            magnitude2 += Math.pow(vector2[i], 2);
        }
        magnitude1 = Math.sqrt(magnitude1);
        magnitude2 = Math.sqrt(magnitude2);
        if (magnitude1 != 0.0 || magnitude2 != 0.0) {
            CosineSimilarity = dotproduct / (magnitude1 * magnitude2);
        } else {
            return 0.0;
        }

        return CosineSimilarity * 100;
    }


}