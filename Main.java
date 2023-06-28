package VectorSimilarityTool;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimension of the vectors: ");
        int dimension = scanner.nextInt();

        //It gives the size of dimension
        double[] vector1 = new double[dimension];
        double[] vector2 = new double[dimension];

        System.out.println("Enter the elements of vector1: ");
        for (int i = 0; i < dimension; i++) {
            vector1[i] = scanner.nextDouble();
        }

        System.out.println("Enter the elements of vector2: ");
        for (int i = 0; i < dimension; i++) {
            vector2[i] = scanner.nextDouble();
        }

        System.out.println("Select the similarity measure:");
        System.out.println("1. Cosine Similarity");
        System.out.println("2. Euclidean Similarity");
        System.out.println("3. Jaccard Similarity");
        System.out.println("4. Manhattan Distance");
        int choice = scanner.nextInt();

        SimilarityCalculator calculator = SimilarityChoice.createCalculator(choice);

        if (calculator != null) {
            double similarity = calculator.CalculateSimilarity(vector1, vector2);
            System.out.println("Similarity: " + similarity);
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}
