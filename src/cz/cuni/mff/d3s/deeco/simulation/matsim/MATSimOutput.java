package cz.cuni.mff.d3s.deeco.simulation.matsim;

import org.matsim.api.core.v01.Coord;
import org.matsim.api.core.v01.Id;

/**
 * Data coming from MATSim.
 * 
 * @author Michal Kit <kit@d3s.mff.cuni.cz>
 *
 */
public class MATSimOutput {
	public Id currentLinkId;
	public Coord estPosition;
	
	public MATSimOutput(Id currentLinkId, Coord estPostion) {
		this.currentLinkId = currentLinkId;
		this.estPosition = estPostion;
	}
	
	
}
