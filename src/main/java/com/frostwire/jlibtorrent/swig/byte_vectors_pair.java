/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class byte_vectors_pair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected byte_vectors_pair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(byte_vectors_pair obj) {
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
        libtorrent_jni.delete_byte_vectors_pair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public byte_vectors_pair() {
    this(libtorrent_jni.new_byte_vectors_pair__SWIG_0(), true);
  }

  public byte_vectors_pair(byte_vector first, byte_vector second) {
    this(libtorrent_jni.new_byte_vectors_pair__SWIG_1(byte_vector.getCPtr(first), first, byte_vector.getCPtr(second), second), true);
  }

  public byte_vectors_pair(byte_vectors_pair other) {
    this(libtorrent_jni.new_byte_vectors_pair__SWIG_2(byte_vectors_pair.getCPtr(other), other), true);
  }

  public void setFirst(byte_vector value) {
    libtorrent_jni.byte_vectors_pair_first_set(swigCPtr, this, byte_vector.getCPtr(value), value);
  }

  public byte_vector getFirst() {
    long cPtr = libtorrent_jni.byte_vectors_pair_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new byte_vector(cPtr, false);
  }

  public void setSecond(byte_vector value) {
    libtorrent_jni.byte_vectors_pair_second_set(swigCPtr, this, byte_vector.getCPtr(value), value);
  }

  public byte_vector getSecond() {
    long cPtr = libtorrent_jni.byte_vectors_pair_second_get(swigCPtr, this);
    return (cPtr == 0) ? null : new byte_vector(cPtr, false);
  }

}
