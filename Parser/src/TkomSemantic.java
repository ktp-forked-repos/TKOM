/**
 * Zapewnia sprawdzanie zgodnoœci semantycznej skryptu. (Istnienie zmiennych, zgodnoœæ typów itp.)
 * 
 * @author Piotr Jastrzêbski
 * 
 */public class TkomSemantic {
	public static double _get(String v1) {
		double result;
		try {
			result = Dummies._get(v1);
		} catch (NullPointerException e) {
			result = -1;
			showMsg("Unknown variable: " + v1);
		}
		return result;
	}

	public static boolean ifInt(double x) {
		return x == (long) x;
	}
	
	public static void showMsg(String str){
		System.err.println(str);
	}

	public static boolean _houghC(double v1, double v2, double v3, double v4) {
		if (!ifInt(v2)) {
			showMsg("HoughC: Variable minDist: " + v2
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v3)) {
			showMsg("HoughC: Variable gaussSize: " + v3
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v4)) {
			showMsg("HoughC: Variable gaussSigma: " + v4
					+ " has type 'double'. Expected 'int'.");
			return false;
		}else
			Dummies._houghC(v1, v2, v3, v4);
		return true;
	}

	/** Obs³uga funkcji programu - transformata Hougha (proste) */
	public static boolean _houghL(double v1, double v2, double v3, double v4,
			double v5, double v6, double v7) {
		if (!ifInt(v1)) {
			showMsg("HoughL: Variable rho: " + v1
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v3)) {
			showMsg("HoughL: Variable threshold: " + v3
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v4)) {
			showMsg("HoughL: Variable minLineLenght: " + v4
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v5)) {
			showMsg("HoughL: Variable minLineGap: " + 5
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v6)) {
			showMsg("HoughL: Variable cannyT1: " + v6
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v7)) {
			showMsg("HoughL: Variable cannyT2: " + v7
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else
			Dummies._houghL(v1, v2, v3, v4, v5, v6, v7);

		return true;
	}

	/** Obs³uga funkcji programu - detektor Harrisa */
	public static boolean _harris(double v1, double v2, double v3, double v4,
			boolean v5, double v6) {
		if (!ifInt(v1)) {
			showMsg("Harris: Variable maxCorners: " + v1
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v3)) {
			showMsg("Harris: Variable minDistance: " + v3
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else if (!ifInt(v4)) {
			showMsg("Harris: Variable blockSize: " + v4
					+ " has type 'double'. Expected 'int'.");
			return false;
		} else
			Dummies._harris(v1, v2, v3, v4, v5, v6);
		return true;
	}

}
