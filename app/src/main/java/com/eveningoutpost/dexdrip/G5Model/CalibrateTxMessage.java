package com.eveningoutpost.dexdrip.G5Model;


// created by jamorham

import com.eveningoutpost.dexdrip.Models.JoH;
import com.eveningoutpost.dexdrip.Models.UserError;

public class CalibrateTxMessage extends TransmitterMessage {

    final byte opcode = 0x34;
    final int length = 9;

    public CalibrateTxMessage(int glucose, int dexTime) {
        init(opcode, length);
        data.putShort((short) glucose);
        data.putInt(dexTime);
        appendCRC();
        UserError.Log.d(TAG, "CalibrateGlucoseTxMessage dbg: " + JoH.bytesToHex(byteSequence));
    }

}
