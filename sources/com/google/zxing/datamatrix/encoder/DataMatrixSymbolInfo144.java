package com.google.zxing.datamatrix.encoder;

import org.objectweb.asm.Opcodes;

final class DataMatrixSymbolInfo144 extends SymbolInfo {
    public int getDataLengthForInterleavedBlock(int i) {
        return i <= 8 ? Opcodes.IFGE : Opcodes.IFLT;
    }

    public int getInterleavedBlockCount() {
        return 10;
    }

    DataMatrixSymbolInfo144() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }
}
