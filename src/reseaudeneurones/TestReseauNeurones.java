package reseaudeneurones;

import java.util.ArrayList;
import java.util.Arrays;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;

public class TestReseauNeurones {

	public static void main(String[] args) {

		MultiLayerPerceptron neuronNetwork = new MultiLayerPerceptron(2, 4, 1);

		DataSet training = new DataSet(2, 1);

		// true - true = true

		// true - false = true

		// false - true = true

		// false - false = false

		DataSetRow rOne = new DataSetRow(new double[] { 1, 1 }, new double[] { 1 });
		DataSetRow rTwo = new DataSetRow(new double[] { 1, 0 }, new double[] { 1 });
		DataSetRow rThree = new DataSetRow(new double[] {0, 1 }, new double[] { 1 });
		DataSetRow rFour = new DataSetRow(new double[] {0, 0 }, new double[] { 0 });

		training.addRow(rOne);
		training.addRow(rTwo);
		training.addRow(rThree);
		training.addRow(rFour);

		neuronNetwork.learn(training);
		neuronNetwork.learn(training);
		neuronNetwork.learn(training);

		neuronNetwork.setInput(1, 1);
		neuronNetwork.calculate();
		for (double output : neuronNetwork.getOutput()) {
			System.out.println(output);
		}
		
		neuronNetwork.setInput(1, 0);
		neuronNetwork.calculate();
		for (double output : neuronNetwork.getOutput()) {
			System.out.println(output);
		}
		
		neuronNetwork.setInput(0, 1);
		neuronNetwork.calculate();
		for (double output : neuronNetwork.getOutput()) {
			System.out.println(output);
		}
		
		neuronNetwork.setInput(0, 0);
		neuronNetwork.calculate();
		for (double output : neuronNetwork.getOutput()) {
			System.out.println(output);
		}

	}

}
