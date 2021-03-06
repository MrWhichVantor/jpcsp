/* This autogenerated file is part of jpcsp. */
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

package jpcsp.HLE.modules150;

import jpcsp.HLE.Modules;
import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class sceAudiocodec implements HLEModule {
	@Override
	public String getName() { return "sceAudiocodec"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceAudiocodeCheckNeedMemFunction, 0x9D3F790C);
			mm.addFunction(sceAudiocodecInitFunction, 0x5B37EB1D);
			mm.addFunction(sceAudiocodecDecodeFunction, 0x70A703F8);
			mm.addFunction(sceAudiocodecGetInfoFunction, 0x8ACA11D5);
			mm.addFunction(sceAudiocodec_6CD2A861Function, 0x6CD2A861);
			mm.addFunction(sceAudiocodec_59176A0FFunction, 0x59176A0F);
			mm.addFunction(sceAudiocodecGetEDRAMFunction, 0x3A20A200);
			mm.addFunction(sceAudiocodecReleaseEDRAMFunction, 0x29681260);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceAudiocodeCheckNeedMemFunction);
			mm.removeFunction(sceAudiocodecInitFunction);
			mm.removeFunction(sceAudiocodecDecodeFunction);
			mm.removeFunction(sceAudiocodecGetInfoFunction);
			mm.removeFunction(sceAudiocodec_6CD2A861Function);
			mm.removeFunction(sceAudiocodec_59176A0FFunction);
			mm.removeFunction(sceAudiocodecGetEDRAMFunction);
			mm.removeFunction(sceAudiocodecReleaseEDRAMFunction);
			
		}
	}
	
	
	public void sceAudiocodeCheckNeedMem(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodeCheckNeedMem [0x9D3F790C]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudiocodecInit(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodecInit [0x5B37EB1D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudiocodecDecode(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodecDecode [0x70A703F8]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudiocodecGetInfo(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodecGetInfo [0x8ACA11D5]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudiocodec_6CD2A861(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodec_6CD2A861 [0x6CD2A861]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudiocodec_59176A0F(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodec_59176A0F [0x59176A0F]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudiocodecGetEDRAM(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodecGetEDRAM [0x3A20A200]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAudiocodecReleaseEDRAM(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAudiocodecReleaseEDRAM [0x29681260]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public final HLEModuleFunction sceAudiocodeCheckNeedMemFunction = new HLEModuleFunction("sceAudiocodec", "sceAudiocodeCheckNeedMem") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodeCheckNeedMem(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodeCheckNeedMem(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudiocodecInitFunction = new HLEModuleFunction("sceAudiocodec", "sceAudiocodecInit") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodecInit(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodecInit(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudiocodecDecodeFunction = new HLEModuleFunction("sceAudiocodec", "sceAudiocodecDecode") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodecDecode(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodecDecode(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudiocodecGetInfoFunction = new HLEModuleFunction("sceAudiocodec", "sceAudiocodecGetInfo") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodecGetInfo(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodecGetInfo(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudiocodec_6CD2A861Function = new HLEModuleFunction("sceAudiocodec", "sceAudiocodec_6CD2A861") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodec_6CD2A861(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodec_6CD2A861(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudiocodec_59176A0FFunction = new HLEModuleFunction("sceAudiocodec", "sceAudiocodec_59176A0F") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodec_59176A0F(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodec_59176A0F(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudiocodecGetEDRAMFunction = new HLEModuleFunction("sceAudiocodec", "sceAudiocodecGetEDRAM") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodecGetEDRAM(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodecGetEDRAM(processor);";
		}
	};
    
	public final HLEModuleFunction sceAudiocodecReleaseEDRAMFunction = new HLEModuleFunction("sceAudiocodec", "sceAudiocodecReleaseEDRAM") {
		@Override
		public final void execute(Processor processor) {
			sceAudiocodecReleaseEDRAM(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAudiocodecModule.sceAudiocodecReleaseEDRAM(processor);";
		}
	};
    
};
