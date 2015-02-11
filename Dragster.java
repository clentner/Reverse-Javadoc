/**
 * Dragster is a class to represent a dragster that
 *  races at a drag strip.
 * 
 *  Create Dragster objects and "race" them to determine
 *  their elapsed time for a 1/4 mile race.
 */
public Dragster {

	/**
	 * Private instance variable for the number of seconds to "burn out"
	 *  the tires. Typically under 10 seconds.
	 */
 	private int burnTime;

	/**
	 * Private instance variable for the time it takes the
	 *  driver to react to the "go" signal. Typical time is
	 *  around 0.5 second.
	 */
 	private double reactionTime;

	/**
	 * Private instance variable for the amount of torque (ft-lbs)
	 *  generated by the engine. Typical values are around 1000.
	 */
 	private int torque;

	/**
	 * Private constant to convert torque values to equivalent time.
	 *  Value = 5000
	 */
 	private double TORQUE2TIME;

	/**
	 * Private instance variable for the amount of traction the tires
	 *  have. Typical values for traction are between 0.5 and 1.0.
	 *  Tires are "conditioned" prior to racing by "burning out"
	 *  (squealing the tires in place) to remove a layer of oxidized
	 *  rubber and to preheat the tire. Typical burnout times are a
	 *  few seconds (under 10 seconds).
	 */
 	private double traction;



	/**
	 * Function to "burn out" the dragster tires just prior to racing.
	 *  Sets the traction as a result of "burning out" the tires.
	 * 
	 *  traction = traction * burnFactor
	 * 
	 *  Where burnFactor is the value returned from conditionTires().
	 */
	public void burnout() {
		//TODO Add method body for burnout()
	}

	/**
	 * Conditioning function to prepare tires for race
	 * 
	 *  2.5 * ( e^ -( (time * time - (10 * time) + 25) / 50 )  ) / sqrt( 2 * PI )
	 */
	private double conditionTires(double time) {
		//TODO Add method body for conditionTires(double time)
	}

	/**
	 * Perform the race. Calculates a race time. The race time will be determined
	 *  by the following:
	 *    reactionTime + ( 1 / ( (torque / TORQUE2TIME) * effectiveTraction ) )
	 */
	public double race() {
		//TODO Add method body for race()
	}

	/**
	 * Returns the following String representation of this Dragster object
	 *  with the following format:
	 * 
	 *  Reaction Time: w Torque: x Traction: y Burn Time: z
	 * 
	 *  Where w, x, y, and z are the reactionTime, torque, traction and burnTime
	 */
	public java.lang.String toString() {
		//TODO Add method body for toString()
	}


}