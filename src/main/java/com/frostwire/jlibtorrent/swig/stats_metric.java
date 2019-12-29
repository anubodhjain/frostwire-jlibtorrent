/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class stats_metric {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected stats_metric(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(stats_metric obj) {
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
        libtorrent_jni.delete_stats_metric(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setValue_index(int value) {
    libtorrent_jni.stats_metric_value_index_set(swigCPtr, this, value);
  }

  public int getValue_index() {
    return libtorrent_jni.stats_metric_value_index_get(swigCPtr, this);
  }

  public void setType(metric_type_t value) {
    libtorrent_jni.stats_metric_type_set(swigCPtr, this, value.swigValue());
  }

  public metric_type_t getType() {
    return metric_type_t.swigToEnum(libtorrent_jni.stats_metric_type_get(swigCPtr, this));
  }

  public String get_name() {
    return libtorrent_jni.stats_metric_get_name(swigCPtr, this);
  }

  public stats_metric() {
    this(libtorrent_jni.new_stats_metric(), true);
  }

}
