package RBNLearning;

import java.util.Vector;

import RBNExceptions.RBNCompatibilityException;
import RBNpackage.OneStrucData;
import RBNpackage.ProbForm;
import RBNpackage.RelStruc;

public class GGUpperGroundAtomNode extends GGProbFormNode {

	/* The atom for which this is the upper ground atom node;
	 */
	private String myatom;
	
	/* If this is an upper ground atom node: instval represents
	 * the current instantiation value of this atom:
	 * if this node repesents an atom which is instantiated to true (false) in the data, then
	 * instval  = Integer(1) (Integer(0)). If this node
	 * represents an atom which is not instantiated in the data, then 
	 * instval is the indicator node for this atom
	 * 
	 */
	private Object instval;
	
	
	/* If this is the Upper Ground Atom Node of 
	 * an un-instantiated atom, then myindicator is the corresponding 
	 * indicator node. Otherwise set to null.
	 */
	private GGAtomNode myindicator;
	
	/* The set of all IndicatorMaxNodes on whose value 
	 * this node depends. 
	 */
	private Vector<GGAtomMaxNode> mymaxindicators;
	
	
	/* The set of all IndicatorSumNodes on whose value 
	 * this node depends. 
	 */
	private Vector<GGAtomSumNode> mysumindicators;
	
	
	public GGUpperGroundAtomNode(GradientGraphO gg, ProbForm pf, RelStruc A,
			OneStrucData I) throws RBNCompatibilityException {
		super(gg, pf, A, I);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double evaluate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double evaluateGrad(int param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void evaluateBounds() {
		// TODO Auto-generated method stub

	}

}
