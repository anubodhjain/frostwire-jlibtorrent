/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class portmap_alert extends alert {
  private transient long swigCPtr;

  protected portmap_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.portmap_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(portmap_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_portmap_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.portmap_alert_type(swigCPtr, this);
  }

  public alert_category_t category() {
    return new alert_category_t(libtorrent_jni.portmap_alert_category(swigCPtr, this), true);
  }

  public String what() {
    return libtorrent_jni.portmap_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.portmap_alert_message(swigCPtr, this);
  }

  public int getMapping() {
    return libtorrent_jni.portmap_alert_mapping_get(swigCPtr, this);
  }

  public int getExternal_port() {
    return libtorrent_jni.portmap_alert_external_port_get(swigCPtr, this);
  }

  public portmap_protocol getMap_protocol() {
    return portmap_protocol.swigToEnum(libtorrent_jni.portmap_alert_map_protocol_get(swigCPtr, this));
  }

  public portmap_transport getMap_transport() {
    return portmap_transport.swigToEnum(libtorrent_jni.portmap_alert_map_transport_get(swigCPtr, this));
  }

  public final static int priority = libtorrent_jni.portmap_alert_priority_get();
  public final static int alert_type = libtorrent_jni.portmap_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.portmap_alert_static_category_get(), false);
}
