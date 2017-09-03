package ru.alexsk.humTree;

import java.util.List;

/**
 * Created by alexsk on 03.09.17.
 */
public class Human {

  private Integer _id;

  private Integer _parent_id;

  private String _first_name;

  private String _last_name;

  private List<Human> childs;

  Human (Integer _id, Integer _parent_id, String _first_name, String _last_name) {
    this._id = _id;
    this._parent_id = _parent_id;
    this._first_name = _first_name;
    this._last_name = _last_name;
  }

  public List<Human> getChilds() {
    return childs;
  }

  public void setChilds(List<Human> childs) {
    this.childs = childs;
  }

  public Integer get_parent_id() {
    return _parent_id;
  }

  public void set_parent_id(Integer _parent_id) {
    this._parent_id = _parent_id;
  }

  public String get_first_name() {
    return _first_name;
  }

  public void set_first_name(String _first_name) {
    this._first_name = _first_name;
  }

  public String get_last_name() {
    return _last_name;
  }

  public void set_last_name(String _last_name) {
    this._last_name = _last_name;
  }

  public Integer get_id() {
    return _id;
  }

  public void set_id(Integer _id) {
    this._id = _id;
  }

}
