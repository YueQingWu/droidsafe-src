package android.content;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

public interface ISyncContext extends android.os.IInterface
{

public static abstract class Stub extends android.os.Binder implements android.content.ISyncContext
{
private static final java.lang.String DESCRIPTOR = "android.content.ISyncContext";

public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}

public static android.content.ISyncContext asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.ISyncContext))) {
return ((android.content.ISyncContext)iin);
}
return new android.content.ISyncContext.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_sendHeartbeat:
{
data.enforceInterface(DESCRIPTOR);
this.sendHeartbeat();
reply.writeNoException();
return true;
}
case TRANSACTION_onFinished:
{
data.enforceInterface(DESCRIPTOR);
android.content.SyncResult _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.SyncResult.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onFinished(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.ISyncContext
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}

public void sendHeartbeat() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_sendHeartbeat, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}

public void onFinished(android.content.SyncResult result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onFinished, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_sendHeartbeat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}

public void sendHeartbeat() throws android.os.RemoteException;

public void onFinished(android.content.SyncResult result) throws android.os.RemoteException;
}
