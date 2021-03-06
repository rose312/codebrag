package com.softwaremill.codebrag.dao.invitation

import com.softwaremill.codebrag.domain.Invitation


trait InvitationDAO {

  def save(invitation:Invitation)

  def findByCode(code:String):Option[Invitation]

  def removeByCode(code:String)

}

