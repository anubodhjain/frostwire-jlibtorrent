/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class sha1_hash_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected sha1_hash_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sha1_hash_vector obj) {
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
        libtorrent_jni.delete_sha1_hash_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public sha1_hash_vector() {
    this(libtorrent_jni.new_sha1_hash_vector(), true);
  }

  public long size() {
    return libtorrent_jni.sha1_hash_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.sha1_hash_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.sha1_hash_vector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.sha1_hash_vector_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.sha1_hash_vector_clear(swigCPtr, this);
  }

  public void push_back(sha1_hash x) {
    libtorrent_jni.sha1_hash_vector_push_back(swigCPtr, this, sha1_hash.getCPtr(x), x);
  }

  public sha1_hash get(int i) {
    return new sha1_hash(libtorrent_jni.sha1_hash_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, sha1_hash val) {
    libtorrent_jni.sha1_hash_vector_set(swigCPtr, this, i, sha1_hash.getCPtr(val), val);
  }

}
