/* Generated By:JJTree: Do not edit this line. ANDCOND.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ANDCOND extends SimpleNode {
  public ANDCOND(int id) {
    super(id);
  }

  public ANDCOND(CALParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CALParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=86b33a7ff16a09c0ceae1b70266a4e3d (do not edit this line) */