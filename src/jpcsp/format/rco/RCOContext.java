/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */
package jpcsp.format.rco;

import java.awt.image.BufferedImage;
import java.util.Map;

public class RCOContext {
	public byte[] buffer;
	public int offset;
	public Map<Integer, String> events;
	public Map<Integer, BufferedImage> images;

	public RCOContext(byte[] buffer, int offset, Map<Integer, String> events, Map<Integer, BufferedImage> images) {
		this.buffer = buffer;
		this.offset = offset;
		this.events = events;
		this.images = images;
	}
}
