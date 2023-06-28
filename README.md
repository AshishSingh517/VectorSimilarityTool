# VectorSimilarityTool
The Similarity Measurement project provides a Java implementation for measuring similarity between vectors using various similarity metrics. It includes implementations for the following similarity metrics:
•	Cosine Similarity
•	Euclidean Distance
•	Jaccard Similarity
•	Manhattan Distance

Usage
To use the Similarity Measurement library, follow these steps:
1.	Initialize the vectors by providing the dimension of the vectors and entering the elements for vector1 and vector2.
2.	Choose the desired similarity metric to calculate the similarity between the vectors.
3.	The library will calculate and display the similarity value between the vectors based on the selected metric.

Similarity Metrics

1. Cosine Similarity
The Cosine Similarity measures the cosine of the angle between two vectors. It determines the similarity by comparing the orientations of the vectors, regardless of their magnitudes.

2. Euclidean Distance
The Euclidean Distance calculates the distance between two vectors in Euclidean space. It measures the straight-line distance between the vectors' endpoints.

3. Jaccard Similarity
The Jaccard Similarity measures the similarity between sets. It calculates the size of the intersection divided by the size of the union of the sets.

4. Manhattan Distance
The Manhattan Distance calculates the distance between two vectors by summing the absolute differences between their corresponding elements. It represents the distance required to travel from one point to another in a grid-like path.

Project Structure

The project consists of the following classes:

•	SimilarityCalculator (Interface): Defines the contract for similarity calculators.

•	AbstractSimilarity (Abstract class): Provides common functionality for similarity calculators.

•	CosineSimilarity: Calculates the cosine similarity between vectors.

•	EuclideanDistance: Calculates the Euclidean distance between vectors.

•	JaccardDistance: Calculates the Jaccard distance between vectors.

•	ManhattanDistance: Calculates the Manhattan distance between vectors.

•	Main: Contains the main method to run the similarity measurement program.

Conclusion

The Similarity Measurement project provides a flexible and easy-to-use solution for measuring similarity between vectors using different metrics.
