/* Generated By:JJTree: Do not edit this line. NUMBER.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class NUMBER extends SimpleNode {
  public NUMBER(int id) {
    super(id);
  }

  public NUMBER(CALParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CALParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e446fb3c03f9d61613f8015e256e05a1 (do not edit this line) */