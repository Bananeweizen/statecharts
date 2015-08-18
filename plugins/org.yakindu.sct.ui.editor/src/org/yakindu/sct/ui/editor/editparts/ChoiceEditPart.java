/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.yakindu.gmf.runtime.editparts.FixedSizeShapeNodeEditPart;
import org.yakindu.sct.ui.editor.editor.figures.ChoiceFigure;
import org.yakindu.sct.ui.editor.editor.figures.utils.MapModeUtils;
import org.yakindu.sct.ui.editor.policies.EnlargeContainerEditPolicy;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class ChoiceEditPart extends FixedSizeShapeNodeEditPart {

	public ChoiceEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EnlargeContainerEditPolicy.ROLE, new EnlargeContainerEditPolicy());
	}

	@Override
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = super.createNodeFigure();
		figure.setBackgroundColor(org.eclipse.draw2d.ColorConstants.white);
		figure.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
		return figure;
	}

	@Override
	public Dimension getDefaultSize() {
		return MapModeUtils.getMappedDimensions(getMapMode(), MapModeUtils.DEFAULT_SMALL_NODE_DIMENSION);
	}

	@Override
	public IFigure createPrimaryShape() {
		return new ChoiceFigure();
	}

}
