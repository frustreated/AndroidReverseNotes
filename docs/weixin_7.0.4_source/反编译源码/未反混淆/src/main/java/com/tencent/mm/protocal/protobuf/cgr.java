package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cgr extends bsr {
    public String sign;
    public SKBuiltinBuffer_t wNd;
    public int wxx;
    public int wxy;
    public SKBuiltinBuffer_t wxz;
    public String xfz;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56987);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wxz == null) {
                bVar = new b("Not all required fields were included: ReqText");
                AppMethodBeat.o(56987);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.iz(2, this.wxx);
            aVar.iz(3, this.wxy);
            if (this.wxz != null) {
                aVar.iy(4, this.wxz.computeSize());
                this.wxz.writeFields(aVar);
            }
            if (this.wNd != null) {
                aVar.iy(5, this.wNd.computeSize());
                this.wNd.writeFields(aVar);
            }
            if (this.sign != null) {
                aVar.e(6, this.sign);
            }
            if (this.xfz != null) {
                aVar.e(7, this.xfz);
            }
            AppMethodBeat.o(56987);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (ix + e.a.a.b.b.a.bs(2, this.wxx)) + e.a.a.b.b.a.bs(3, this.wxy);
            if (this.wxz != null) {
                ix += e.a.a.a.ix(4, this.wxz.computeSize());
            }
            if (this.wNd != null) {
                ix += e.a.a.a.ix(5, this.wNd.computeSize());
            }
            if (this.sign != null) {
                ix += e.a.a.b.b.a.f(6, this.sign);
            }
            if (this.xfz != null) {
                ix += e.a.a.b.b.a.f(7, this.xfz);
            }
            AppMethodBeat.o(56987);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.wxz == null) {
                bVar = new b("Not all required fields were included: ReqText");
                AppMethodBeat.o(56987);
                throw bVar;
            }
            AppMethodBeat.o(56987);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cgr cgr = (cgr) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            SKBuiltinBuffer_t sKBuiltinBuffer_t;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cgr.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(56987);
                    return 0;
                case 2:
                    cgr.wxx = aVar3.BTU.vd();
                    AppMethodBeat.o(56987);
                    return 0;
                case 3:
                    cgr.wxy = aVar3.BTU.vd();
                    AppMethodBeat.o(56987);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cgr.wxz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(56987);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cgr.wNd = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(56987);
                    return 0;
                case 6:
                    cgr.sign = aVar3.BTU.readString();
                    AppMethodBeat.o(56987);
                    return 0;
                case 7:
                    cgr.xfz = aVar3.BTU.readString();
                    AppMethodBeat.o(56987);
                    return 0;
                default:
                    AppMethodBeat.o(56987);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56987);
            return -1;
        }
    }
}
