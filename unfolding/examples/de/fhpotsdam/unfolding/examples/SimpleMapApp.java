package de.fhpotsdam.unfolding.examples;

import processing.core.PApplet;
import codeanticode.glgraphics.GLConstants;
import de.fhpotsdam.unfolding.Map;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class SimpleMapApp extends PApplet {

	Map map;

	public void setup() {
		size(800, 600, GLConstants.GLGRAPHICS);

		map = new Map(this);
		map.setTweening(false);
		MapUtils.createDefaultEventDispatcher(this, map);
		map.zoomToLevel(2);
	}

	public void draw() {
		background(0);

		map.draw();
	}
	
	public void keyPressed() {
		if (key == '*') {
			map.zoomIn();
		}
		if (key == '_') {
			map.zoomOut();
		}
	}
}
