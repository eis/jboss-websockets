package org.atmosphere.jboss.websockets;

/**
 * Represents a single web socket frame.
 *
 * @author Mike Brock
 */
public interface Frame {
  public FrameType getType();
}
